package swing

class Main {
    static void main(String[] args) {
        def es = new EditStyle(size: 12, color: "Blue", font: "Times")
        println es.propertyString()
    }
}
