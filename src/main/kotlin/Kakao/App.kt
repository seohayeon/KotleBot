package Kakao
import org.socis.SocisClient
import org.socis.event.EventListenerService;
import org.socis.event.message.MessageEvent;


class EventListenerTest: EventListenerService() {
    override fun onMessage(event:MessageEvent) {
        if (event.getMessage().equals("!ping")) {
            event.getChannel().sendMessage("pong!");
        }
    }
}


fun main() {
     val client:SocisClient = SocisClient()
     println("ready")
     client.addListener(EventListenerTest())
     client.start()
     println("start")
}