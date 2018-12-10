package UserInterface;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class PlaySound {

	private MediaPlayer normalSound;
	private MediaPlayer bossSound;

	public PlaySound() {
		Media audio = new Media(getClass().getClassLoader().getResource("sounds/normal_battle.wav").toExternalForm());
		this.normalSound = new MediaPlayer(audio);

		Media audio2 = new Media(getClass().getClassLoader().getResource("sounds/boss-battle.wav").toExternalForm());
		this.bossSound = new MediaPlayer(audio2);

		this.normalSound.setVolume(0.1);
		this.bossSound.setVolume(0.1);
	}

	public void playNormalSound() {
		normalSound.play();
	}

	public void playBossSound() {
		bossSound.play();
	}

	public void stopNormalSound() {
		normalSound.stop();
	}

	public void stopBossSound() {
		bossSound.stop();
	}
}
