def build() {
    def mvnhome = "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
    echo "${mvnhome}"
    //sh '${mvnhome} -B -DskipTests clean package'
}
def test(){
    def mvnhome = "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
    echo "${mvnhome} test"
    //def mvnhome= "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
    //sh '/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn test'
}