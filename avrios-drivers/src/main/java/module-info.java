module com.avrios.drivers {
    exports com.avrios.drivers;
    opens com.avrios.drivers;

    requires spring.context;
    requires javax.inject;
    requires java.xml.ws.annotation;
    requires com.google.common;
}