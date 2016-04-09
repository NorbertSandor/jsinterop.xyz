package xyz.jsinterop.client.dom;

/*
 * #%L
 * jsinterop
 * %%
 * Copyright (C) 2016 Norbert Sándor
 * %%
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * #L%
 */

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface HTMLMediaElement extends HTMLElement {
	/**
	 * Returns an AudioTrackList object with the audio tracks for a given video
	 * element.
	 */
	@JsProperty
	public abstract AudioTrackList getAudioTracks();

	/**
	 * Returns an AudioTrackList object with the audio tracks for a given video
	 * element.
	 */
	@JsProperty
	public abstract void setAudioTracks(final AudioTrackList value);

	/**
	 * Gets or sets a value that indicates whether to start playing the media
	 * automatically.
	 */
	@JsProperty
	public abstract boolean isAutoplay();

	/**
	 * Gets or sets a value that indicates whether to start playing the media
	 * automatically.
	 */
	@JsProperty
	public abstract void setAutoplay(final boolean value);

	/**
	 * Gets a collection of buffered time ranges.
	 */
	@JsProperty
	public abstract TimeRanges getBuffered();

	/**
	 * Gets a collection of buffered time ranges.
	 */
	@JsProperty
	public abstract void setBuffered(final TimeRanges value);

	/**
	 * Gets or sets a flag that indicates whether the client provides a set of
	 * controls for the media (in case the developer does not include controls
	 * for the player).
	 */
	@JsProperty
	public abstract boolean isControls();

	/**
	 * Gets or sets a flag that indicates whether the client provides a set of
	 * controls for the media (in case the developer does not include controls
	 * for the player).
	 */
	@JsProperty
	public abstract void setControls(final boolean value);

	/**
	 * Gets the address or URL of the current media resource that is selected by
	 * IHTMLMediaElement.
	 */
	@JsProperty
	public abstract String getCurrentSrc();

	/**
	 * Gets the address or URL of the current media resource that is selected by
	 * IHTMLMediaElement.
	 */
	@JsProperty
	public abstract void setCurrentSrc(final String value);

	/**
	 * Gets or sets the current playback position, in seconds.
	 */
	@JsProperty
	public abstract double getCurrentTime();

	/**
	 * Gets or sets the current playback position, in seconds.
	 */
	@JsProperty
	public abstract void setCurrentTime(final double value);

	@JsProperty
	public abstract boolean isDefaultMuted();

	@JsProperty
	public abstract void setDefaultMuted(final boolean value);

	/**
	 * Gets or sets the default playback rate when the user is not using fast
	 * forward or reverse for a video or audio resource.
	 */
	@JsProperty
	public abstract double getDefaultPlaybackRate();

	/**
	 * Gets or sets the default playback rate when the user is not using fast
	 * forward or reverse for a video or audio resource.
	 */
	@JsProperty
	public abstract void setDefaultPlaybackRate(final double value);

	/**
	 * Returns the duration in seconds of the current media resource. A NaN
	 * value is returned if duration is not available, or Infinity if the media
	 * resource is streaming.
	 */
	@JsProperty
	public abstract double getDuration();

	/**
	 * Returns the duration in seconds of the current media resource. A NaN
	 * value is returned if duration is not available, or Infinity if the media
	 * resource is streaming.
	 */
	@JsProperty
	public abstract void setDuration(final double value);

	/**
	 * Gets information about whether the playback has ended or not.
	 */
	@JsProperty
	public abstract boolean isEnded();

	/**
	 * Gets information about whether the playback has ended or not.
	 */
	@JsProperty
	public abstract void setEnded(final boolean value);

	/**
	 * Returns an object representing the current error state of the audio or
	 * video element.
	 */
	@JsProperty
	public abstract MediaError getError();

	/**
	 * Returns an object representing the current error state of the audio or
	 * video element.
	 */
	@JsProperty
	public abstract void setError(final MediaError value);

	/**
	 * Gets or sets a flag to specify whether playback should restart after it
	 * completes.
	 */
	@JsProperty
	public abstract boolean isLoop();

	/**
	 * Gets or sets a flag to specify whether playback should restart after it
	 * completes.
	 */
	@JsProperty
	public abstract void setLoop(final boolean value);

	/**
	 * Specifies the purpose of the audio or video media, such as background
	 * audio or alerts.
	 */
	@JsProperty
	public abstract String getMsAudioCategory();

	/**
	 * Specifies the purpose of the audio or video media, such as background
	 * audio or alerts.
	 */
	@JsProperty
	public abstract void setMsAudioCategory(final String value);

	/**
	 * Specifies the output device id that the audio will be sent to.
	 */
	@JsProperty
	public abstract String getMsAudioDeviceType();

	/**
	 * Specifies the output device id that the audio will be sent to.
	 */
	@JsProperty
	public abstract void setMsAudioDeviceType(final String value);

	@JsProperty
	public abstract MSGraphicsTrust getMsGraphicsTrustStatus();

	@JsProperty
	public abstract void setMsGraphicsTrustStatus(final MSGraphicsTrust value);

	/**
	 * Gets the MSMediaKeys object, which is used for decrypting media data,
	 * that is associated with this media element.
	 */
	@JsProperty
	public abstract MSMediaKeys getMsKeys();

	/**
	 * Gets the MSMediaKeys object, which is used for decrypting media data,
	 * that is associated with this media element.
	 */
	@JsProperty
	public abstract void setMsKeys(final MSMediaKeys value);

	/**
	 * Gets or sets whether the DLNA PlayTo device is available.
	 */
	@JsProperty
	public abstract boolean isMsPlayToDisabled();

	/**
	 * Gets or sets whether the DLNA PlayTo device is available.
	 */
	@JsProperty
	public abstract void setMsPlayToDisabled(final boolean value);

	/**
	 * Gets or sets the path to the preferred media source. This enables the
	 * Play To target device to stream the media content, which can be DRM
	 * protected, from a different location, such as a cloud media server.
	 */
	@JsProperty
	public abstract String getMsPlayToPreferredSourceUri();

	/**
	 * Gets or sets the path to the preferred media source. This enables the
	 * Play To target device to stream the media content, which can be DRM
	 * protected, from a different location, such as a cloud media server.
	 */
	@JsProperty
	public abstract void setMsPlayToPreferredSourceUri(final String value);

	/**
	 * Gets or sets the primary DLNA PlayTo device.
	 */
	@JsProperty
	public abstract boolean isMsPlayToPrimary();

	/**
	 * Gets or sets the primary DLNA PlayTo device.
	 */
	@JsProperty
	public abstract void setMsPlayToPrimary(final boolean value);

	/**
	 * Gets the source associated with the media element for use by the
	 * PlayToManager.
	 */
	@JsProperty
	public abstract Object getMsPlayToSource();

	/**
	 * Gets the source associated with the media element for use by the
	 * PlayToManager.
	 */
	@JsProperty
	public abstract void setMsPlayToSource(final Object value);

	/**
	 * Specifies whether or not to enable low-latency playback on the media
	 * element.
	 */
	@JsProperty
	public abstract boolean isMsRealTime();

	/**
	 * Specifies whether or not to enable low-latency playback on the media
	 * element.
	 */
	@JsProperty
	public abstract void setMsRealTime(final boolean value);

	/**
	 * Gets or sets a flag that indicates whether the audio (either audio or the
	 * audio track on video media) is muted.
	 */
	@JsProperty
	public abstract boolean isMuted();

	/**
	 * Gets or sets a flag that indicates whether the audio (either audio or the
	 * audio track on video media) is muted.
	 */
	@JsProperty
	public abstract void setMuted(final boolean value);

	/**
	 * Gets the current network activity for the element.
	 */
	@JsProperty
	public abstract double getNetworkState();

	/**
	 * Gets the current network activity for the element.
	 */
	@JsProperty
	public abstract void setNetworkState(final double value);

	@JsProperty
	public abstract EventListener<MSMediaKeyNeededEvent> getOnmsneedkey();

	@JsProperty
	public abstract void setOnmsneedkey(final EventListener<MSMediaKeyNeededEvent> value);

	/**
	 * Gets a flag that specifies whether playback is paused.
	 */
	@JsProperty
	public abstract boolean isPaused();

	/**
	 * Gets a flag that specifies whether playback is paused.
	 */
	@JsProperty
	public abstract void setPaused(final boolean value);

	/**
	 * Gets or sets the current rate of speed for the media resource to play.
	 * This speed is expressed as a multiple of the normal speed of the media
	 * resource.
	 */
	@JsProperty
	public abstract double getPlaybackRate();

	/**
	 * Gets or sets the current rate of speed for the media resource to play.
	 * This speed is expressed as a multiple of the normal speed of the media
	 * resource.
	 */
	@JsProperty
	public abstract void setPlaybackRate(final double value);

	/**
	 * Gets TimeRanges for the current media resource that has been played.
	 */
	@JsProperty
	public abstract TimeRanges getPlayed();

	/**
	 * Gets TimeRanges for the current media resource that has been played.
	 */
	@JsProperty
	public abstract void setPlayed(final TimeRanges value);

	/**
	 * Gets or sets the current playback position, in seconds.
	 */
	@JsProperty
	public abstract String getPreload();

	/**
	 * Gets or sets the current playback position, in seconds.
	 */
	@JsProperty
	public abstract void setPreload(final String value);

	@JsProperty
	public abstract int getReadyState();

	@JsProperty
	public abstract void setReadyState(final int value);

	/**
	 * Returns a TimeRanges object that represents the ranges of the current
	 * media resource that can be seeked.
	 */
	@JsProperty
	public abstract TimeRanges getSeekable();

	/**
	 * Returns a TimeRanges object that represents the ranges of the current
	 * media resource that can be seeked.
	 */
	@JsProperty
	public abstract void setSeekable(final TimeRanges value);

	/**
	 * Gets a flag that indicates whether the the client is currently moving to
	 * a new playback position in the media resource.
	 */
	@JsProperty
	public abstract boolean isSeeking();

	/**
	 * Gets a flag that indicates whether the the client is currently moving to
	 * a new playback position in the media resource.
	 */
	@JsProperty
	public abstract void setSeeking(final boolean value);

	/**
	 * The address or URL of the a media resource that is to be considered.
	 */
	@JsProperty
	public abstract String getSrc();

	/**
	 * The address or URL of the a media resource that is to be considered.
	 */
	@JsProperty
	public abstract void setSrc(final String value);

	@JsProperty
	public abstract TextTrackList getTextTracks();

	@JsProperty
	public abstract void setTextTracks(final TextTrackList value);

	@JsProperty
	public abstract VideoTrackList getVideoTracks();

	@JsProperty
	public abstract void setVideoTracks(final VideoTrackList value);

	/**
	 * Gets or sets the volume level for audio portions of the media element.
	 */
	@JsProperty
	public abstract double getVolume();

	/**
	 * Gets or sets the volume level for audio portions of the media element.
	 */
	@JsProperty
	public abstract void setVolume(final double value);

	@JsProperty
	public abstract double getHAVE_CURRENT_DATA();

	@JsProperty
	public abstract void setHAVE_CURRENT_DATA(final double value);

	@JsProperty
	public abstract double getHAVE_ENOUGH_DATA();

	@JsProperty
	public abstract void setHAVE_ENOUGH_DATA(final double value);

	@JsProperty
	public abstract double getHAVE_FUTURE_DATA();

	@JsProperty
	public abstract void setHAVE_FUTURE_DATA(final double value);

	@JsProperty
	public abstract double getHAVE_METADATA();

	@JsProperty
	public abstract void setHAVE_METADATA(final double value);

	@JsProperty
	public abstract double getHAVE_NOTHING();

	@JsProperty
	public abstract void setHAVE_NOTHING(final double value);

	@JsProperty
	public abstract double getNETWORK_EMPTY();

	@JsProperty
	public abstract void setNETWORK_EMPTY(final double value);

	@JsProperty
	public abstract double getNETWORK_IDLE();

	@JsProperty
	public abstract void setNETWORK_IDLE(final double value);

	@JsProperty
	public abstract double getNETWORK_LOADING();

	@JsProperty
	public abstract void setNETWORK_LOADING(final double value);

	@JsProperty
	public abstract double getNETWORK_NO_SOURCE();

	@JsProperty
	public abstract void setNETWORK_NO_SOURCE(final double value);

	@JsMethod
	public abstract TextTrack addTextTrack(final String kind);

	@JsMethod
	public abstract TextTrack addTextTrack(final String kind, final String label);

	@JsMethod
	public abstract TextTrack addTextTrack(final String kind, final String label, final String language);

	/**
	 * Returns a string that specifies whether the client can play a given media
	 * resource type.
	 */
	@JsMethod
	public abstract String canPlayType(final String type);

	/**
	 * Fires immediately after the client loads the object.
	 */
	@JsMethod
	public abstract void load();

	/**
	 * Clears all effects from the media pipeline.
	 */
	@JsMethod
	public abstract void msClearEffects();

	@JsMethod
	public abstract Object msGetAsCastingSource();

	/**
	 * Inserts the specified audio effect into media pipeline.
	 */
	@JsMethod
	public abstract void msInsertAudioEffect(final String activatableClassId, final boolean effectRequired);

	/**
	 * Inserts the specified audio effect into media pipeline.
	 */
	@JsMethod
	public abstract void msInsertAudioEffect(final String activatableClassId, final boolean effectRequired,
			final Object config);

	@JsMethod
	public abstract void msSetMediaKeys(final MSMediaKeys mediaKeys);

	/**
	 * Specifies the media protection manager for a given media pipeline.
	 */
	@JsMethod
	public abstract void msSetMediaProtectionManager();

	/**
	 * Specifies the media protection manager for a given media pipeline.
	 */
	@JsMethod
	public abstract void msSetMediaProtectionManager(final Object mediaProtectionManager);

	/**
	 * Pauses the current playback and sets paused to TRUE. This can be used to
	 * test whether the media is playing or paused. You can also use the pause
	 * or play events to tell whether the media is playing or not.
	 */
	@JsMethod
	public abstract void pause();

	/**
	 * Loads and starts playback of a media resource.
	 */
	@JsMethod
	public abstract void play();

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListener<?> listener, final boolean useCapture);

	@JsMethod
	public abstract void addEventListener(final String type, final EventListenerObject listener,
			final boolean useCapture);
}
