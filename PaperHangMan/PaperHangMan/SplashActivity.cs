using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

using Android.Graphics;

namespace PaperHangMan
{
    [Activity(Label = "Hangman", MainLauncher =true, NoHistory =true, Icon ="@drawable/HangmanLogo", ScreenOrientation = Android.Content.PM.ScreenOrientation.Portrait)]
    public class SplashActivity : Activity
    {

        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView(Resource.Layout.HangmanSplash);

            WaitGUI();
        }
        public async Task WaitGUI()
        {
            await Task.Delay(4000);
            StartActivity(typeof(MainActivity));
        }

    }
}