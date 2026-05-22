plugins {
    id("org.springframework.boot") version "4.0.6" apply false
}

allprojects {
    group = "com.flowscope"
    version = "0.0.1-SNAPSHOT"
}

subprojects {
    apply(plugin = "java-library")

    configure<JavaPluginExtension> {
        toolchain {
            languageVersion = JavaLanguageVersion.of(25)
        }
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        // dependency-management 플러그인 대신 platform BOM 사용
        "implementation"(platform("org.springframework.boot:spring-boot-dependencies:4.0.6"))
        "testImplementation"("org.springframework.boot:spring-boot-starter-test")
        "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}