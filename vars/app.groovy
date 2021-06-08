def availableTypes() {
    return ["deploy"]
}

def call(Map config) {
    def type = config.get('type', 'backend')
    checkTypeAvailability(type)

    "$type"(config)
}

def checkTypeAvailability(String type) {
    if (!availableTypes().contains(type)) {
        throw new Exception("Type ${type} is not available")
    }
}
