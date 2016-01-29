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
	public abstract Object getReadyState();

	@JsProperty
	public abstract void setReadyState(final Object value);

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

	@JsOverlay
	public default void addEventListenerMSContentZoom(final EventListener<UIEvent> listener) {
		addEventListener("MSContentZoom", listener);
	}

	@JsOverlay
	public default void addEventListenerMSContentZoom(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("MSContentZoom", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureChange", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureChange(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureChange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureDoubleTap", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureDoubleTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureDoubleTap", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureEnd", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureEnd(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureEnd", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureHold", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureHold(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureHold", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureStart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSGestureTap", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGestureTap(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSGestureTap", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSGotPointerCapture(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSGotPointerCapture", listener);
	}

	@JsOverlay
	public default void addEventListenerMSGotPointerCapture(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSGotPointerCapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener) {
		addEventListener("MSInertiaStart", listener);
	}

	@JsOverlay
	public default void addEventListenerMSInertiaStart(final EventListener<MSGestureEvent> listener, final boolean useCapture) {
		addEventListener("MSInertiaStart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSLostPointerCapture(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSLostPointerCapture", listener);
	}

	@JsOverlay
	public default void addEventListenerMSLostPointerCapture(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSLostPointerCapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSManipulationStateChanged(final EventListener<MSManipulationEvent> listener) {
		addEventListener("MSManipulationStateChanged", listener);
	}

	@JsOverlay
	public default void addEventListenerMSManipulationStateChanged(final EventListener<MSManipulationEvent> listener,
			final boolean useCapture) {
		addEventListener("MSManipulationStateChanged", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerCancel", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerCancel(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerCancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerDown", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerDown(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerDown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerEnter", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerEnter(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerEnter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerLeave", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerLeave(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerLeave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerMove", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerMove(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerMove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerOut", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOut(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerOut", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerOver", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerOver(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerOver", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener) {
		addEventListener("MSPointerUp", listener);
	}

	@JsOverlay
	public default void addEventListenerMSPointerUp(final EventListener<MSPointerEvent> listener, final boolean useCapture) {
		addEventListener("MSPointerUp", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<UIEvent> listener) {
		addEventListener("abort", listener);
	}

	@JsOverlay
	public default void addEventListenerAbort(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("abort", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerActivate(final EventListener<UIEvent> listener) {
		addEventListener("activate", listener);
	}

	@JsOverlay
	public default void addEventListenerActivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("activate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener) {
		addEventListener("ariarequest", listener);
	}

	@JsOverlay
	public default void addEventListenerAriarequest(final EventListener<AriaRequestEvent> listener, final boolean useCapture) {
		addEventListener("ariarequest", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforeactivate(final EventListener<UIEvent> listener) {
		addEventListener("beforeactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("beforeactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforecopy(final EventListener<DragEvent> listener) {
		addEventListener("beforecopy", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforecopy(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("beforecopy", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforecut(final EventListener<DragEvent> listener) {
		addEventListener("beforecut", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforecut(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("beforecut", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforedeactivate(final EventListener<UIEvent> listener) {
		addEventListener("beforedeactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforedeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("beforedeactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBeforepaste(final EventListener<DragEvent> listener) {
		addEventListener("beforepaste", listener);
	}

	@JsOverlay
	public default void addEventListenerBeforepaste(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("beforepaste", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerBlur(final EventListener<FocusEvent> listener) {
		addEventListener("blur", listener);
	}

	@JsOverlay
	public default void addEventListenerBlur(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("blur", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCanplay(final EventListener<Event> listener) {
		addEventListener("canplay", listener);
	}

	@JsOverlay
	public default void addEventListenerCanplay(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("canplay", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCanplaythrough(final EventListener<Event> listener) {
		addEventListener("canplaythrough", listener);
	}

	@JsOverlay
	public default void addEventListenerCanplaythrough(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("canplaythrough", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerChange(final EventListener<Event> listener) {
		addEventListener("change", listener);
	}

	@JsOverlay
	public default void addEventListenerChange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("change", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerClick(final EventListener<MouseEvent> listener) {
		addEventListener("click", listener);
	}

	@JsOverlay
	public default void addEventListenerClick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("click", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCommand(final EventListener<CommandEvent> listener) {
		addEventListener("command", listener);
	}

	@JsOverlay
	public default void addEventListenerCommand(final EventListener<CommandEvent> listener, final boolean useCapture) {
		addEventListener("command", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerContextmenu(final EventListener<PointerEvent> listener) {
		addEventListener("contextmenu", listener);
	}

	@JsOverlay
	public default void addEventListenerContextmenu(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("contextmenu", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCopy(final EventListener<DragEvent> listener) {
		addEventListener("copy", listener);
	}

	@JsOverlay
	public default void addEventListenerCopy(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("copy", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCuechange(final EventListener<Event> listener) {
		addEventListener("cuechange", listener);
	}

	@JsOverlay
	public default void addEventListenerCuechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("cuechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerCut(final EventListener<DragEvent> listener) {
		addEventListener("cut", listener);
	}

	@JsOverlay
	public default void addEventListenerCut(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("cut", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener) {
		addEventListener("dblclick", listener);
	}

	@JsOverlay
	public default void addEventListenerDblclick(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("dblclick", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDeactivate(final EventListener<UIEvent> listener) {
		addEventListener("deactivate", listener);
	}

	@JsOverlay
	public default void addEventListenerDeactivate(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("deactivate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDrag(final EventListener<DragEvent> listener) {
		addEventListener("drag", listener);
	}

	@JsOverlay
	public default void addEventListenerDrag(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("drag", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragend(final EventListener<DragEvent> listener) {
		addEventListener("dragend", listener);
	}

	@JsOverlay
	public default void addEventListenerDragend(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragenter(final EventListener<DragEvent> listener) {
		addEventListener("dragenter", listener);
	}

	@JsOverlay
	public default void addEventListenerDragenter(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragenter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragleave(final EventListener<DragEvent> listener) {
		addEventListener("dragleave", listener);
	}

	@JsOverlay
	public default void addEventListenerDragleave(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragleave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragover(final EventListener<DragEvent> listener) {
		addEventListener("dragover", listener);
	}

	@JsOverlay
	public default void addEventListenerDragover(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDragstart(final EventListener<DragEvent> listener) {
		addEventListener("dragstart", listener);
	}

	@JsOverlay
	public default void addEventListenerDragstart(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("dragstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDrop(final EventListener<DragEvent> listener) {
		addEventListener("drop", listener);
	}

	@JsOverlay
	public default void addEventListenerDrop(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("drop", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerDurationchange(final EventListener<Event> listener) {
		addEventListener("durationchange", listener);
	}

	@JsOverlay
	public default void addEventListenerDurationchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("durationchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerEmptied(final EventListener<Event> listener) {
		addEventListener("emptied", listener);
	}

	@JsOverlay
	public default void addEventListenerEmptied(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("emptied", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerEnded(final EventListener<Event> listener) {
		addEventListener("ended", listener);
	}

	@JsOverlay
	public default void addEventListenerEnded(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("ended", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener) {
		addEventListener("error", listener);
	}

	@JsOverlay
	public default void addEventListenerError(final EventListener<ErrorEvent> listener, final boolean useCapture) {
		addEventListener("error", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerFocus(final EventListener<FocusEvent> listener) {
		addEventListener("focus", listener);
	}

	@JsOverlay
	public default void addEventListenerFocus(final EventListener<FocusEvent> listener, final boolean useCapture) {
		addEventListener("focus", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener) {
		addEventListener("gotpointercapture", listener);
	}

	@JsOverlay
	public default void addEventListenerGotpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("gotpointercapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerInput(final EventListener<Event> listener) {
		addEventListener("input", listener);
	}

	@JsOverlay
	public default void addEventListenerInput(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("input", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeydown(final EventListener<KeyboardEvent> listener) {
		addEventListener("keydown", listener);
	}

	@JsOverlay
	public default void addEventListenerKeydown(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keydown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeypress(final EventListener<KeyboardEvent> listener) {
		addEventListener("keypress", listener);
	}

	@JsOverlay
	public default void addEventListenerKeypress(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keypress", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerKeyup(final EventListener<KeyboardEvent> listener) {
		addEventListener("keyup", listener);
	}

	@JsOverlay
	public default void addEventListenerKeyup(final EventListener<KeyboardEvent> listener, final boolean useCapture) {
		addEventListener("keyup", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener) {
		addEventListener("load", listener);
	}

	@JsOverlay
	public default void addEventListenerLoad(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("load", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadeddata(final EventListener<Event> listener) {
		addEventListener("loadeddata", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadeddata(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadeddata", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadedmetadata(final EventListener<Event> listener) {
		addEventListener("loadedmetadata", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadedmetadata(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadedmetadata", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLoadstart(final EventListener<Event> listener) {
		addEventListener("loadstart", listener);
	}

	@JsOverlay
	public default void addEventListenerLoadstart(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("loadstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener) {
		addEventListener("lostpointercapture", listener);
	}

	@JsOverlay
	public default void addEventListenerLostpointercapture(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("lostpointercapture", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener) {
		addEventListener("mousedown", listener);
	}

	@JsOverlay
	public default void addEventListenerMousedown(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mousedown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseenter(final EventListener<MouseEvent> listener) {
		addEventListener("mouseenter", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseenter(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseenter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseleave(final EventListener<MouseEvent> listener) {
		addEventListener("mouseleave", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseleave(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseleave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMousemove(final EventListener<MouseEvent> listener) {
		addEventListener("mousemove", listener);
	}

	@JsOverlay
	public default void addEventListenerMousemove(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mousemove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseout(final EventListener<MouseEvent> listener) {
		addEventListener("mouseout", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseout(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseout", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseover(final EventListener<MouseEvent> listener) {
		addEventListener("mouseover", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseover(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMouseup(final EventListener<MouseEvent> listener) {
		addEventListener("mouseup", listener);
	}

	@JsOverlay
	public default void addEventListenerMouseup(final EventListener<MouseEvent> listener, final boolean useCapture) {
		addEventListener("mouseup", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMousewheel(final EventListener<MouseWheelEvent> listener) {
		addEventListener("mousewheel", listener);
	}

	@JsOverlay
	public default void addEventListenerMousewheel(final EventListener<MouseWheelEvent> listener, final boolean useCapture) {
		addEventListener("mousewheel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerMsneedkey(final EventListener<MSMediaKeyNeededEvent> listener) {
		addEventListener("msneedkey", listener);
	}

	@JsOverlay
	public default void addEventListenerMsneedkey(final EventListener<MSMediaKeyNeededEvent> listener, final boolean useCapture) {
		addEventListener("msneedkey", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPaste(final EventListener<DragEvent> listener) {
		addEventListener("paste", listener);
	}

	@JsOverlay
	public default void addEventListenerPaste(final EventListener<DragEvent> listener, final boolean useCapture) {
		addEventListener("paste", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPause(final EventListener<Event> listener) {
		addEventListener("pause", listener);
	}

	@JsOverlay
	public default void addEventListenerPause(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("pause", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPlay(final EventListener<Event> listener) {
		addEventListener("play", listener);
	}

	@JsOverlay
	public default void addEventListenerPlay(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("play", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPlaying(final EventListener<Event> listener) {
		addEventListener("playing", listener);
	}

	@JsOverlay
	public default void addEventListenerPlaying(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("playing", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointercancel(final EventListener<PointerEvent> listener) {
		addEventListener("pointercancel", listener);
	}

	@JsOverlay
	public default void addEventListenerPointercancel(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointercancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerdown(final EventListener<PointerEvent> listener) {
		addEventListener("pointerdown", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerdown(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerdown", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerenter(final EventListener<PointerEvent> listener) {
		addEventListener("pointerenter", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerenter(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerenter", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerleave(final EventListener<PointerEvent> listener) {
		addEventListener("pointerleave", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerleave(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerleave", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointermove(final EventListener<PointerEvent> listener) {
		addEventListener("pointermove", listener);
	}

	@JsOverlay
	public default void addEventListenerPointermove(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointermove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerout(final EventListener<PointerEvent> listener) {
		addEventListener("pointerout", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerout(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerout", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerover(final EventListener<PointerEvent> listener) {
		addEventListener("pointerover", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerover(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerover", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerPointerup(final EventListener<PointerEvent> listener) {
		addEventListener("pointerup", listener);
	}

	@JsOverlay
	public default void addEventListenerPointerup(final EventListener<PointerEvent> listener, final boolean useCapture) {
		addEventListener("pointerup", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener) {
		addEventListener("progress", listener);
	}

	@JsOverlay
	public default void addEventListenerProgress(final EventListener<ProgressEvent> listener, final boolean useCapture) {
		addEventListener("progress", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerRatechange(final EventListener<Event> listener) {
		addEventListener("ratechange", listener);
	}

	@JsOverlay
	public default void addEventListenerRatechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("ratechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerReset(final EventListener<Event> listener) {
		addEventListener("reset", listener);
	}

	@JsOverlay
	public default void addEventListenerReset(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("reset", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerScroll(final EventListener<UIEvent> listener) {
		addEventListener("scroll", listener);
	}

	@JsOverlay
	public default void addEventListenerScroll(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("scroll", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSeeked(final EventListener<Event> listener) {
		addEventListener("seeked", listener);
	}

	@JsOverlay
	public default void addEventListenerSeeked(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("seeked", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSeeking(final EventListener<Event> listener) {
		addEventListener("seeking", listener);
	}

	@JsOverlay
	public default void addEventListenerSeeking(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("seeking", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSelect(final EventListener<UIEvent> listener) {
		addEventListener("select", listener);
	}

	@JsOverlay
	public default void addEventListenerSelect(final EventListener<UIEvent> listener, final boolean useCapture) {
		addEventListener("select", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSelectstart(final EventListener<Event> listener) {
		addEventListener("selectstart", listener);
	}

	@JsOverlay
	public default void addEventListenerSelectstart(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("selectstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerStalled(final EventListener<Event> listener) {
		addEventListener("stalled", listener);
	}

	@JsOverlay
	public default void addEventListenerStalled(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("stalled", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSubmit(final EventListener<Event> listener) {
		addEventListener("submit", listener);
	}

	@JsOverlay
	public default void addEventListenerSubmit(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("submit", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerSuspend(final EventListener<Event> listener) {
		addEventListener("suspend", listener);
	}

	@JsOverlay
	public default void addEventListenerSuspend(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("suspend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTimeupdate(final EventListener<Event> listener) {
		addEventListener("timeupdate", listener);
	}

	@JsOverlay
	public default void addEventListenerTimeupdate(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("timeupdate", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener) {
		addEventListener("touchcancel", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchcancel(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchcancel", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener) {
		addEventListener("touchend", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchend(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchend", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener) {
		addEventListener("touchmove", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchmove(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchmove", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener) {
		addEventListener("touchstart", listener);
	}

	@JsOverlay
	public default void addEventListenerTouchstart(final EventListener<TouchEvent> listener, final boolean useCapture) {
		addEventListener("touchstart", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerVolumechange(final EventListener<Event> listener) {
		addEventListener("volumechange", listener);
	}

	@JsOverlay
	public default void addEventListenerVolumechange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("volumechange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWaiting(final EventListener<Event> listener) {
		addEventListener("waiting", listener);
	}

	@JsOverlay
	public default void addEventListenerWaiting(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("waiting", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener) {
		addEventListener("webkitfullscreenchange", listener);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenchange(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("webkitfullscreenchange", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener) {
		addEventListener("webkitfullscreenerror", listener);
	}

	@JsOverlay
	public default void addEventListenerWebkitfullscreenerror(final EventListener<Event> listener, final boolean useCapture) {
		addEventListener("webkitfullscreenerror", listener, useCapture);
	}

	@JsOverlay
	public default void addEventListenerWheel(final EventListener<WheelEvent> listener) {
		addEventListener("wheel", listener);
	}

	@JsOverlay
	public default void addEventListenerWheel(final EventListener<WheelEvent> listener, final boolean useCapture) {
		addEventListener("wheel", listener, useCapture);
	}

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
