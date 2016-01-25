package org.openhab.binding.mysensors.config;

import org.openhab.binding.mysensors.MySensorsBindingConstants;

public class MySensorsBridgeConfiguration {
	/** The serial port or ip/port the gateway is attached to */
	public String serialPort;
	public String ipAddress;
	public Integer tcpPort;
	public Integer sendDelay;
}
