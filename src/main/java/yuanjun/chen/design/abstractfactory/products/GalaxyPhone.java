/**  
 * @Title: GalaxyPhone.java   
 * @Package: yuanjun.chen.design.abstractfactory.products   
 * @Description: TODO(用一句话描述该文件做什么)   
 * @author: 陈元俊     
 * @date: 2018年7月31日 下午4:01:37   
 * @version V1.0 
 * @Copyright: 2018 All rights reserved. 
 */
package yuanjun.chen.design.abstractfactory.products;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**   
 * @ClassName: GalaxyPhone   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author: 陈元俊 
 * @date: 2018年7月31日 下午4:01:37  
 */
public class GalaxyPhone extends CellPhone{

    private static final Logger logger = LogManager.getLogger(GalaxyPhone.class);
    @Override
    public void ring() {
        logger.info("Over The Horizon~~~");
    }

}
