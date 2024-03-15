package persistenc

class xml {
    <?xml version="1.0" encoding="UTF-8"?>
    <persistence xmlns="http://java.sun.com/xml/ns/persistence"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
    version="2.0">
    <persistence-unit name="farmaciaPU" transaction-type="RESOURCE_LOCAL">
    <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>

    <!-- Entidades mapeadas -->
    <!-- <class>com.example.modelo.Entidade</class> -->

    <!-- Propriedades de conexão -->
    <properties>
    <!-- Configurações do MySQL -->
    <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
    <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/farmacia_hibernate"/>
    <property name="javax.persistence.jdbc.user" value="root"/>
    <property name="javax.persistence.jdbc.password" value="root"/>

    <!-- Configurações do Hibernate -->
    <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect"/>

    <!-- Exibir comandos SQL gerados -->
    <property name="hibernate.show_sql" value="true"/>

    <!-- Ativar o modo de atualização automática do esquema -->
    <property name="hibernate.hbm2ddl.auto" value="update"/>
    </properties>
    </persistence-unit>
    </persistence>

}