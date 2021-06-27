package blog.rishabh.spyder.models

class Error(
        var code: Int = 999,
        var message: String = "Unknown error"
) {
    override fun toString(): String {
        return "$code: $message"
    }
}