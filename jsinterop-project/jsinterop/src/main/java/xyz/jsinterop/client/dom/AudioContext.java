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
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import xyz.jsinterop.client.core.ArrayBuffer;
import xyz.jsinterop.client.core.Float32Array;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public interface AudioContext extends EventTarget {
	@JsProperty
	public abstract double getCurrentTime();

	@JsProperty
	public abstract void setCurrentTime(final double value);

	@JsProperty
	public abstract AudioDestinationNode getDestination();

	@JsProperty
	public abstract void setDestination(final AudioDestinationNode value);

	@JsProperty
	public abstract AudioListener getListener();

	@JsProperty
	public abstract void setListener(final AudioListener value);

	@JsProperty
	public abstract double getSampleRate();

	@JsProperty
	public abstract void setSampleRate(final double value);

	@JsMethod
	public abstract AnalyserNode createAnalyser();

	@JsMethod
	public abstract BiquadFilterNode createBiquadFilter();

	@JsMethod
	public abstract AudioBuffer createBuffer(final double numberOfChannels, final double length,
			final double sampleRate);

	@JsMethod
	public abstract AudioBufferSourceNode createBufferSource();

	@JsMethod
	public abstract ChannelMergerNode createChannelMerger();

	@JsMethod
	public abstract ChannelMergerNode createChannelMerger(final double numberOfInputs);

	@JsMethod
	public abstract ChannelSplitterNode createChannelSplitter();

	@JsMethod
	public abstract ChannelSplitterNode createChannelSplitter(final double numberOfOutputs);

	@JsMethod
	public abstract ConvolverNode createConvolver();

	@JsMethod
	public abstract DelayNode createDelay();

	@JsMethod
	public abstract DelayNode createDelay(final double maxDelayTime);

	@JsMethod
	public abstract DynamicsCompressorNode createDynamicsCompressor();

	@JsMethod
	public abstract GainNode createGain();

	@JsMethod
	public abstract MediaElementAudioSourceNode createMediaElementSource(final HTMLMediaElement mediaElement);

	@JsMethod
	public abstract OscillatorNode createOscillator();

	@JsMethod
	public abstract PannerNode createPanner();

	@JsMethod
	public abstract PeriodicWave createPeriodicWave(final Float32Array real, final Float32Array imag);

	@JsMethod
	public abstract ScriptProcessorNode createScriptProcessor();

	@JsMethod
	public abstract ScriptProcessorNode createScriptProcessor(final double bufferSize);

	@JsMethod
	public abstract ScriptProcessorNode createScriptProcessor(final double bufferSize,
			final double numberOfInputChannels);

	@JsMethod
	public abstract ScriptProcessorNode createScriptProcessor(final double bufferSize,
			final double numberOfInputChannels, final double numberOfOutputChannels);

	@JsMethod
	public abstract StereoPannerNode createStereoPanner();

	@JsMethod
	public abstract WaveShaperNode createWaveShaper();

	@JsMethod
	public abstract void decodeAudioData(final ArrayBuffer audioData, final DecodeSuccessCallback successCallback);

	@JsMethod
	public abstract void decodeAudioData(final ArrayBuffer audioData, final DecodeSuccessCallback successCallback,
			final DecodeErrorCallback errorCallback);
}
