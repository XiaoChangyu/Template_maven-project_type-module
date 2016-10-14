package p.ka.template.maven_module_03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import p.ka.template.maven_module_02.TemplateModule02Tool;

/**
 * 功能描述: 模板 Module-03 主入口类
 * @createTime: 2016年10月12日 下午7:06:25
 * @author: <a href="mailto:676096658@qq.com">xiaochangyu</a>
 * @version: 0.1
 * @lastVersion: 0.1
 * @updateTime: 2016年10月12日 下午7:06:25
 * @updateAuthor: <a href="mailto:676096658@qq.com">xiaochangyu</a>
 * @changesSum:
 */
public class TemplateModule03Main {

	private final static Logger logger = LoggerFactory.getLogger(TemplateModule03Main.class);

	/**
	 * 功能描述: 程序入口
	 * @createTime: 2016年10月12日 下午7:06:57
	 * @author: <a href="mailto:676096658@qq.com">xiaochangyu</a>
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Congratulation! Run Right!");
		System.out.println("恭喜! 运行正确!");
		TemplateModule02Tool.printCongratulation();
		logger.info("Congratulation! Run Right!");
		logger.info("恭喜! 运行正确!");
	}
}
