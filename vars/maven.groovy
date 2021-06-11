def mvnhome = "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
def build() {
    echo "${mvnhome}"
    //sh '${mvnhome} -B -DskipTests clean package'
}
def test(){
    //def mvnhome= "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
    //sh '/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn test'
}