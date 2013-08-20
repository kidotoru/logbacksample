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
    private final Logger logger1 = LoggerFactory.getLogger(this.getClass());
    private final Logger logger2 = LoggerFactory.getLogger("MY_LOGGER"); 
    private static final Logger logger3 = LoggerFactory.getLogger(App.class); 
    public static void main( String[] args )
    {
        App app = new App();
        app.outputlog01();
        app.outputlog02();
        app.outputlog03();
        
        App.outputlog04();

    }
    public void outputlog01(){
        this.logger1.trace("TRACE.");
        this.logger1.debug("DEBUG.");
        this.logger1.info("INFO.");
        this.logger1.warn("WARN.");
        this.logger1.error("ERROR.");
        
        if (this.logger1.isDebugEnabled()) {        
            this.logger1.info("INFO.");
        }
        
        this.logger2.info("other logger.");
    }
    
    public void outputlog02(){
        this.logger1.info("ログ出力");
        this.logger1.info("ログ出力={}",1);
        this.logger1.info("ログ出力={},{}",1,2);
        this.logger1.info("ログ出力={},{},{}",1,2,3);
        this.logger1.info("ログ出力={},{},{},{}",1,2,3,4);
        this.logger1.info("ログ出力={},{},{},{},{}",1,2,3,4,5);
        this.logger1.info("ログ出力={},{},{},{},{},{}",1,2,3,4,5,6);

    }
    
    public void  outputlog03(){
        
        String str = null;
        
        try{
            str.length();
        } catch (Exception e) {
            this.logger1.error("致命的エラー", e);
        }
    }
    
    public static void outputlog04(){
        App.logger3.info("static");
    }
    
}
