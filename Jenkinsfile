pipeline {
    agent any
    tools {
        maven 'Maven 3.9.5'
        jdk 'Java 17'
    }
    stages {
        stage('Checkout') {
            steps { git 'https://github.com/your-repo/ui-automation-framework.git' }
        }
        stage('Run Tests') {
            steps { sh 'mvn clean test' }
        }
        stage('Allure Report') {
            steps { allure includeProperties: false, results: [[path: 'target/allure-results']] }
        }
        stage('Archive Screenshots') {
            steps { archiveArtifacts artifacts: 'screenshots/**/*.png', fingerprint: true }
        }
    }
}