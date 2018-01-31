#!/usr/bin/env bash
java \
-classpath "lib/*" \
-p mods \
--add-modules java.se.ee \
-m com.avrios.web/com.avrios.web.Application
