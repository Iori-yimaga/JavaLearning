import java.io.*;
import java.net.*;

/**
 * @author Iori_yimaga
 */
public class HtmlAnalyze {
    public static void main(String[] args) {
        try{
            URL myUrl = new URL("https://www.jhun.edu.cn/");
            URLConnection myCon = myUrl.openConnection();
            InputStream myIn = myCon.getInputStream();
            byte[] buf = new byte[1024];
            int myLen = 0;
            String strContent = "";
            while((myLen = myIn.read(buf))!=-1){
                String Aline = new String(buf,0,myLen,"UTF-8");
                strContent = strContent + Aline;
            }
            myIn.close();
            String[] strRows = strContent.split("<span class='Article_Title'>");
            for(int i = 1;i <= 6;i++){
                String strTemp = strRows[i];
                int startLoc = strTemp.indexOf("title='") + 7;
                int endLoc = strTemp.indexOf("'",startLoc);
                String newsTitle = strTemp.substring(startLoc,endLoc);
                System.out.println("i=" + i + " " + newsTitle);

                startLoc = strTemp.indexOf("href='") + 6;
                endLoc = strTemp.indexOf("'",startLoc);
                String myLink = strTemp.substring(startLoc,endLoc);
                myLink = "https://www.jhun.edu.cn" + myLink;

                Download myDown = new Download(i,myLink);
                myDown.run();
            }
        }
        catch(Exception e){}
    }
}

class Download extends Thread{
    private int threadId;
    private String strDownloadUrl;
    public Download(int threadId,String strDownloadUrl){
        this.threadId = threadId;
        this.strDownloadUrl = strDownloadUrl;
    }
    public void run(){

    }
}
