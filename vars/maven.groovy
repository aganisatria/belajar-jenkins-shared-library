def call(String command){
    sh("chmod +x mvnw")
    sh("./mvnw ${command}")
}