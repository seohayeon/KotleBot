package logger
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object Log {
    fun s(e:String){
        val timeFormat:SimpleDateFormat = SimpleDateFormat("a H:mm:ss", Locale.KOREA);
        val format = timeFormat.format(Date())
        println("[$format] [SUCCESS] $e")
    }
    
    fun e(e:String){
        val timeFormat:SimpleDateFormat = SimpleDateFormat("a H:mm:ss", Locale.KOREA);
        val format = timeFormat.format(Date())
        println("[$format] [ERROR] $e")
    }
    
    fun i(e:String){
        val timeFormat:SimpleDateFormat = SimpleDateFormat("a H:mm:ss", Locale.KOREA);
        val format = timeFormat.format(Date())
        println("[$format] [INFO] $e")
    }
    
    fun d(e:String){
        val timeFormat:SimpleDateFormat = SimpleDateFormat("a H:mm:ss", Locale.KOREA);
        val format = timeFormat.format(Date())
        println("[$format] $e")
    }
}