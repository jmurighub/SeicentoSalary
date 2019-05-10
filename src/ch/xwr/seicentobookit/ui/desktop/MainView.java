
package ch.xwr.seicentobookit.ui.desktop;

import com.vaadin.server.ClientConnector;
import com.vaadin.server.VaadinSession;
import com.xdev.security.authorization.Subject;
import com.xdev.server.aa.openid.auth.AzureUser;
import com.xdev.ui.XdevView;

public class MainView extends XdevView {
	private AzureUser currentUser;

	/**
	 * 
	 */
	public MainView() {
		super();
		this.initUI();
	}

	/**
	 * Event handler delegate method for the {@link XdevView}.
	 *
	 * @see ClientConnector.AttachListener#attach(ClientConnector.AttachEvent)
	 * @eventHandlerDelegate Do NOT delete, used by UI designer!
	 */
	private void this_attach(ClientConnector.AttachEvent event) {
		final Subject sub = VaadinSession.getCurrent().getAttribute(Subject.class);

		if (sub != null && sub instanceof AzureUser)
		{
			this.currentUser = (AzureUser) sub;
		}
				
		//this.label.setValue("Hallo " + this.currentUser.name() + "!");
		DesktopUI main = (DesktopUI) this.getUI(); //.getParent().getUI();
		main.loggedIn(true, currentUser);
	
	}

	/*
	 * WARNING: Do NOT edit!<br>The content of this method is always regenerated
	 * by the UI designer.
	 */
	// <generated-code name="initUI">
	private void initUI() {
		this.setStyleName("closed");
		this.setEnabled(false);
		this.setVisible(false);
	
		this.setSizeFull();
	
		this.addAttachListener(event -> this.this_attach(event));
	} // </generated-code>


}
