#!/usr/bin/env groovy

def call(Map param, Boolean usePipeline = true) {
    def branch = param.get('branch') as String
    def url = param.get('url') as String
if (usePipeline) {
    pipeline {
        agent any
        stages {
           stage('maven build and test') {
              steps {
                script {
                    maven.build()
                    maven.test()
                        }    
                    }
                }
           stage('SonarQube Analytics') {
            steps {
                withSonarQubeEnv('sonar-6') {
                    sh '/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn -Dsonar.analysis.mode=preview org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
                    }
                 }
              }
           }
        }
    }
}
