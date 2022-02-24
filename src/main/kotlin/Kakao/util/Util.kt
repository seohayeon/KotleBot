package util
import com.kaling.KakaoLinkClient




object Util {
    fun sendLink(ctx:KakaoLinkClient, url:String){
        ctx.sendLink("보드게임","""{
            "template_id":69609,
            "template_args":{"board":"$url"},
            "link_ver":"4.0"}""","custom")
    }
}

