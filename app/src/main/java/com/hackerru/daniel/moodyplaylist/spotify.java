package com.hackerru.daniel.moodyplaylist;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.os.Bundle;

import com.spotify.sdk.android.player.ConnectionStateCallback;
import com.spotify.sdk.android.player.Connectivity;
import com.spotify.sdk.android.player.Error;
import com.spotify.sdk.android.player.PlaybackState;
import com.spotify.sdk.android.player.Player;
import com.spotify.sdk.android.player.PlayerEvent;
import com.spotify.sdk.android.player.SpotifyPlayer;

public class spotify extends Activity implements Player.NotificationCallback, ConnectionStateCallback
{
    @SuppressWarnings("SpellCheckingInspection")
    private static final String CLIENT_ID = "a9e209f4dc19414195add5b498fc2dcb";
    @SuppressWarnings("SpellCheckingInspection")
    private static final String REDIRECT_URI = "moodyPlaylist://callback";

    @SuppressWarnings("SpellCheckingInspection")
    private static final String TEST_SONG_URI = "spotify:track:6KywfgRqvgvfJc3JRwaZdZ";

    private static final int REQUEST_CODE = 1000;

    public static final String TAG = "SpotifySdkDemo";

    private SpotifyPlayer mPlayer;
    private PlaybackState mCurrentPlaybackState;
    private BroadcastReceiver mNetworkStateReceiver;

    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onLoggedIn() {

    }

    @Override
    public void onLoggedOut() {

    }

    @Override
    public void onLoginFailed(Error error) {

    }

    @Override
    public void onTemporaryError() {

    }

    @Override
    public void onConnectionMessage(String s) {

    }

    @Override
    public void onPlaybackEvent(PlayerEvent playerEvent) {

    }

    @Override
    public void onPlaybackError(Error error) {

    }
}
