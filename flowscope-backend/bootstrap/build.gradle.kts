plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":common"))
    implementation(project(":domain:sample"))
    implementation(project(":app:sample"))
    implementation(project(":adapter:in-web"))
    implementation(project(":adapter:out-persistence"))
    implementation("org.springframework.boot:spring-boot-starter")
}