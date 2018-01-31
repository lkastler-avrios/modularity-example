module com.avrios.users {
    exports com.avrios.users;
    opens com.avrios.users;

    requires spring.context;
    requires java.xml.ws.annotation;
    requires javax.inject;
    requires com.google.common;
}