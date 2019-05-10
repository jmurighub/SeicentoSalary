
package ch.xwr.seicentobookit.ui.desktop;

import com.vaadin.event.ShortcutAction;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.xdev.server.aa.openid.azure.AzurePopupConfig;
import com.xdev.server.aa.openid.ui.AzureOauthPopupButton;
import com.xdev.ui.XdevButton;
import com.xdev.ui.XdevGridLayout;
import com.xdev.ui.XdevPanel;
import com.xdev.ui.XdevView;

import ch.xwr.seicentobookit.business.helper.AzureHelper;

public class AuthView extends XdevView implements com.xdev.security.authentication.ui.LoginView {

	private final AzureOauthPopupButton azureLoginButton;

	/**
	 *
	 */
	public AuthView() {
		super();
		this.initUI();
				
		// NP String xx = this.getParent().getUI().getPage().getLocation().toString();
		final AzureHelper hlp = new AzureHelper();
		final AzurePopupConfig config = hlp.getAzureConfig();
		this.azureLoginButton =  new AzureOauthPopupButton(config, true);

		this.gridLayout2.replaceComponent(this.cmdLogin, this.azureLoginButton);
	}


	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return null;
	}

	
	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated by
	 * the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.gridLayout = new XdevGridLayout();
		this.panel = new XdevPanel();
		this.gridLayout2 = new XdevGridLayout();
		this.cmdLogin = new XdevButton();
	
		this.panel.setCaption("Login");
		this.panel.setTabIndex(0);
		this.cmdLogin.setCaption("Login");
		this.cmdLogin.setStyleName("friendly");
		this.cmdLogin.setClickShortcut(ShortcutAction.KeyCode.ENTER);
	
		this.gridLayout2.setColumns(1);
		this.gridLayout2.setRows(2);
		this.cmdLogin.setSizeUndefined();
		this.gridLayout2.addComponent(this.cmdLogin, 0, 0);
		this.gridLayout2.setComponentAlignment(this.cmdLogin, Alignment.MIDDLE_RIGHT);
		this.gridLayout2.setColumnExpandRatio(0, 10.0F);
		final CustomComponent gridLayout2_vSpacer = new CustomComponent();
		gridLayout2_vSpacer.setSizeFull();
		this.gridLayout2.addComponent(gridLayout2_vSpacer, 0, 1, 0, 1);
		this.gridLayout2.setRowExpandRatio(1, 1.0F);
		this.gridLayout2.setSizeFull();
		this.panel.setContent(this.gridLayout2);
		this.gridLayout.setColumns(1);
		this.gridLayout.setRows(1);
		this.panel.setSizeUndefined();
		this.gridLayout.addComponent(this.panel, 0, 0);
		this.gridLayout.setComponentAlignment(this.panel, Alignment.MIDDLE_CENTER);
		this.gridLayout.setColumnExpandRatio(0, 10.0F);
		this.gridLayout.setRowExpandRatio(0, 10.0F);
		this.gridLayout.setSizeFull();
		this.setContent(this.gridLayout);
		this.setSizeFull();
	} // </generated-code>

	// <generated-code name="variables">
	private XdevButton cmdLogin;
	private XdevPanel panel;
	private XdevGridLayout gridLayout, gridLayout2;
	// </generated-code>

}
