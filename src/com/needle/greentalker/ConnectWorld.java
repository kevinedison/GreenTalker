package com.needle.greentalker;

import javax.servlet.http.HttpServletRequest;
import org.sword.wechat4j.WechatSupport;

public class ConnectWorld extends WechatSupport{
     
	public ConnectWorld(HttpServletRequest request){
		super(request);
	}
	
	@Override
	protected void onText() {
		responseText("��ã���ӭ���� άϵ������");
		
	}

	@Override
	protected void onImage() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void onVoice() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void onVideo() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void onLocation() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void onLink() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void onUnknown() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void click() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void subscribe() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void unSubscribe() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void scan() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void location() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void view() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void templateMsgCallback() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void scanCodePush() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void scanCodeWaitMsg() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void picSysPhoto() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void picPhotoOrAlbum() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void picWeixin() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void locationSelect() {
		// TODO �Զ����ɵķ������
		
	}
}
