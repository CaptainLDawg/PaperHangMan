package md549d4e89a586d1a7cf6f15c7bcae7fc7d;


public class HangmanMulti
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"";
		mono.android.Runtime.register ("PaperHangMan.HangmanMulti, PaperHangMan, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", HangmanMulti.class, __md_methods);
	}


	public HangmanMulti () throws java.lang.Throwable
	{
		super ();
		if (getClass () == HangmanMulti.class)
			mono.android.TypeManager.Activate ("PaperHangMan.HangmanMulti, PaperHangMan, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
