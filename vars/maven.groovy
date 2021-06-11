def build() {
    def mvnhome = "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
    def settings = params.getOrDefault('settings','settings.xml')
    def DskipTest = params.getOrDefault('DsikpTest','false')
    sh "${mvnhome} -B -DskipTests clean package --settings ${settings} -DskipTest ${DskipTest}"    
    
}
def test(){
    def mvnhome = "/Users/navnitkumarbaranwal/apache-maven-3.8.1/bin/mvn"
    sh "${mvnhome} test"
}
