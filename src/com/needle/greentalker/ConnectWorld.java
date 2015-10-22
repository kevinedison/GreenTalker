package com.needle.greentalker;

import javax.servlet.http.HttpServletRequest;
import org.sword.wechat4j.WechatSupport;

public class ConnectWorld extends WechatSupport{
     
	public ConnectWorld(HttpServletRequest request){
		super(request);
	}
	
	@Override
	protected void onText() {
		responseText("你好，欢迎加入 维系的世界");
		
	}

	@Override
	protected void onImage() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void onVoice() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void onVideo() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void onLocation() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void onLink() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void onUnknown() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void click() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void subscribe() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void unSubscribe() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void scan() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void location() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void view() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void templateMsgCallback() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void scanCodePush() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void scanCodeWaitMsg() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void picSysPhoto() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void picPhotoOrAlbum() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void picWeixin() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void locationSelect() {
		// TODO 自动生成的方法存根
		
	}
}
