def call(Map config = [:]) {
    dir(config.dir ?: 'App') { // Use 'App' as the default directory if not provided
        sh 'chmod +x ./gradlew'
    }
}
