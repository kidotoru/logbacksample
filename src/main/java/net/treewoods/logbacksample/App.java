package net.treewoods.logbacksample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * SLF4J + logback sample.
 *
 */
public class App 
{
    // ロガーのインスタンス
    private final Logger log = LoggerFactory.getLogger(this.getClass());  
    
    public static void main( String[] args )
    {
        App app = new App();
        app.outputlog();
    }
    
    public void outputlog(){
        this.log.info("ログ出力！");
        this.log.info("ログ出力！={}",1);
        this.log.info("ログ出力！={},{}",1,2);
        this.log.info("ログ出力！={},{},{}",1,2,3);
        this.log.info("ログ出力！={},{},{},{}",1,2,3,4);
        this.log.info("ログ出力！={},{},{},{},{}",1,2,3,4,5);
        this.log.info("ログ出力！={},{},{},{},{},{}",1,2,3,4,5,6);

    }
}
