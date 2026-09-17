

The diagram shows how the Adapter Pattern lets incompatible devices be plugged
into a standard power outlet.

### Target

- **PowerOutlet** - The interface the client expects. It declares a single
  method, `plugIn()`, which represents plugging any device into a standard
  outlet. The client only ever talks to this interface, never to the devices
  directly.

### Adaptees

These are the existing device classes. Each one already works, but none of them
understands `plugIn()` because they each expose their own method instead.

- **Laptop** - Has `charge()`.
- **Refrigerator** - Has `startCooling()`.
- **SmartphoneCharger** - Has `chargePhone()`.

### Adapters

Each adapter implements the **PowerOutlet** interface (shown by the dashed
arrows with hollow triangles pointing up to the interface) and holds a reference
to its adaptee (shown by the hollow diamond aggregation lines). When `plugIn()`
is called, the adapter forwards the call to the device's own method.

- **LaptopAdapter** - Wraps a Laptop and translates `plugIn()` to `charge()`.
- **RefrigeratorAdapter** - Wraps a Refrigerator and translates `plugIn()` to
  `startCooling()`.
- **SmartphoneAdapter** - Wraps a SmartphoneCharger and translates `plugIn()`
  to `chargePhone()`.

### Client

- **ApplianceApp** - Contains the `main()` method. It creates each device,
  wraps it in the matching adapter, and calls `plugIn()` on each one through the
  PowerOutlet type. Because it depends only on the interface, adding a new device
  later only requires writing a new adapter, with no changes to the client code.

### Relationships in the Diagram

- **Dashed line with hollow triangle** - Realization. Each adapter implements
  the PowerOutlet interface.
- **Line with hollow diamond** - Aggregation. Each adapter holds a reference to
  its adaptee.
- **Solid arrows from ApplianceApp** - Dependency. The client uses the adapters
  to plug devices in.
## UML Class Diagram

![UML Class Diagram](<img width="2320" height="1320" alt="AdapterPatternn" src="https://github.com/user-attachments/assets/9003467e-204e-4fa0-b0ad-4f264452ed5a" />
)
