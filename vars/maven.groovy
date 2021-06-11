def build() {
    def mvnhome= "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
    sh '${'mvnhome'} -B -DskipTests clean package'
}
def test(){
    def mvnhome= "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
    sh '${'mvnhome'} test'
}