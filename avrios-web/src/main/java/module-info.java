module com.avrios.web {
    exports com.avrios.web;
    opens com.avrios.web;

    uses com.avrios.users.UserService;
    uses com.avrios.users.UserRepository;
    uses com.avrios.drivers.DriverService;
    uses com.avrios.drivers.DriverRepository;

    requires com.avrios.drivers;
    requires com.avrios.users;
    requires spring.boot.autoconfigure;
    requires spring.aop;
    requires spring.context;
    requires javax.inject;
    requires java.validation;
    requires slf4j.api;
    requires spring.boot;
    requires spring.web;
}