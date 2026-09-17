# Problem Statement

This assignment demonstrates the Adapter design pattern applied to a device-charging scenario. Several appliances need to draw power, but each one has its own connection method and none of them can plug directly into a shared outlet. Adapters are introduced so that every device can be powered through one common interface, without changing how the devices themselves work.

Adaptee Objects:

Laptop - a device that runs on battery power and needs charging. Its own method for this is charge().

Refrigerator - a device that must stay powered to keep running. Its own method for this is startCooling().

SmartphoneCharger - a device that powers up a phone. Its own method for this is chargePhone().

Target Object:

PowerOutlet - the shared interface all devices are expected to connect through. It exposes one method, plugIn(), that every adapter must implement.

Adapter Objects:

LaptopAdapter - sits between a Laptop and the PowerOutlet interface, forwarding plugIn() calls to charge().

RefrigeratorAdapter - sits between a Refrigerator and the PowerOutlet interface, forwarding plugIn() calls to startCooling().

SmartphoneAdapter - sits between a SmartphoneCharger and the PowerOutlet interface, forwarding plugIn() calls to chargePhone().

# Class Diagram
