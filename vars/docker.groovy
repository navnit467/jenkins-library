def build() {
    def dockerhome = "/usr/local/bin/docker"
    sh "${dockerhome} build -t navnit/java-docker-build-tutorial:latest ."
}