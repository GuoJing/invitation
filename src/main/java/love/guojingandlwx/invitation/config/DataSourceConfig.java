package love.guojingandlwx.invitation.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * Created by guojing on 2017/3/18.
 */
@Configuration
public class DataSourceConfig {
    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Value("${db.dsn}")
    private String dsn;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.auto-commit}")
    private boolean autoCommit;

    @Value("${spring.datasource.connection-test-query}")
    private String connectionTestQuery;

    /**
     * Hikari config hikari config.
     *
     * @param mysqldsn      the mysql dsn
     * @param mysqlUserName the mysql user name
     * @param mysqlPassword the mysql password
     * @return the hikari config
     */
    public HikariConfig hikariConfig(
            final String mysqldsn, final String mysqlUserName,
            final String mysqlPassword
    ) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(driverClassName);
        config.setAutoCommit(autoCommit);
        config.setConnectionTestQuery(connectionTestQuery);
        config.setJdbcUrl(mysqldsn);
        config.setUsername(mysqlUserName);
        config.setPassword(mysqlPassword);
        return config;
    }

    /**
     * Annoucement data source data source.
     *
     * @return the data source
     */
    @Bean(name = "annoucementDataSource")
    @Primary
    public DataSource annoucementDataSource() {
        return new HikariDataSource(hikariConfig(
                dsn, username, password
        ));
    }

    /**
     * Sql session factory sql session factory.
     *
     * @param dataSource the data source
     * @return the sql session factory
     * @throws Exception the exception
     */
    @Bean(name = "annoucementSqlSession")
    @Primary
    public SqlSessionFactory sqlSessionFactory(
            @Qualifier("annoucementDataSource") final DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);

        PathMatchingResourcePatternResolver resolver;
        resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources(
                "classpath:mapper/*.xml"));
        return sessionFactory.getObject();
    }

    /**
     * Transaction manager data source transaction manager.
     *
     * @return the data source transaction manager
     */
    @Bean(name = "annoucementTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(annoucementDataSource());
    }
}
