<!- Property para Mysql -->

	<!-- Propriedades JDBC -->
	<property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />
	<property name="javax.persistence.jdbc.url" value="jdbc:mysql://host/banco?useTimezone=true&amp;serverTimezone=UTC" />
	<property name="javax.persistence.jdbc.user" value="usuario" />
	<property name="javax.persistence.jdbc.password" value="senha" />
	
	<!-- Configurações específicas do Hibernate -->
	<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL5InnoDBDialect" />
	<property name="hibernate.hbm2ddl.auto" value="update" />
	<property name="hibernate.show_sql" value="true" />
	<property name="hibernate.format_sql" value="true" />