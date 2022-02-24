package Kakao
import org.socis.SocisClient
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import listener.MessageEvent
import logger.Log


fun main() {
     val client:SocisClient = SocisClient()
     client.addListener(MessageEvent())
     client.start()
     Log.s("Start Bot")
}