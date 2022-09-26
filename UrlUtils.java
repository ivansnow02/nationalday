import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.net.MalformedURLException;

public class UrlUtils {
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url + "?" + param);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null)
                result += line;
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException ie) {
            ie.printStackTrace();
        } 
        finally {
            try {
                if (in != null)
                    in.close();
            } 
            catch (Exception e2){   
                e2.printStackTrace();
            }
        }
        return result;
    
    }
}
