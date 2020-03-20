package Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @since 3/20/2020
 * 建造者的具体子类
 * 建造html文件
 */
public class HTMLBuilder extends Builder {

    @Override
    public void makeTitle(String title) {
        System.out.println("<html><head><title>"+title+"</title></head><body>");
        System.out.println("<h1>"+title+"</h1>");
    }

    @Override
    public void makeString(String str) {
        System.out.println("<p>"+str+"</p>");
    }

    @Override
    public void makeItems(String[] items) {
        System.out.println("<ul>");
        for(String str: items)
            System.out.println("<li>"+str+"</li>");
        System.out.println("</ul>");
    }

    @Override
    public void close() {
        System.out.println("</body></html>");
    }
}
