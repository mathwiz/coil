package swing

class EditStyle {
    def size, color, font

    def getProperties() {
        "Size: ${size}, Color: ${color}, Font: ${font}"
    }

    def static main(String[] args) {
        def tester = new EditStyle(size: 12, color: "Red", font: "Helvetica")
        println "Properties: ${tester.properties}"
    }
}