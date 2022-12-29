def call(List commands){
    sh("chmod +x mvnw")
    for(command in commands){ 
        sh("./mvnw ${command}")
    }
}