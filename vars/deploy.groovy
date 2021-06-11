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
           stage('build docker image') {
            steps {
                   sh "/usr/local/bin/docker build -t navnit/java-docker-build-tutorial:latest ."
                   //sh "/usr/local/bin/docker run -p 8081:8081 --rm hello-world-java"
                    }
                 } 
              }
           }
        }
    }
