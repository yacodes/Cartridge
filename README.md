# Cartridge
> Set of supercollider synthesizers, packed in the usable, encapsulated Class

## Installation
Since this project is under heavily development — installation is made through [Git](https://git-scm.com/) and [Quarks](https://github.com/supercollider-quarks/quarks):
```supercollider
Quarks.install("https://github.com/aleksandryakunichev/Cartridge.git");
```
This action will download the whole repository to your's `Platform.userExtensionDir`, making `Cartridge` class accessible from your SuperCollider code.

## Usage
`Cartridge` class has one method — `new`, which accepts only one parameter: current server. So, for installing all the SynthDefs at once:
```supercollider
Cartridge(Server.local); // or s, or whatever server you need
```
Thats all — now you can use all the SynthDefs from this quark.

## Included synths
### `crdgKick`
<img alt="crdgKick" src="media/crdgKick.gif" align="right" width="407px"/>

```supercollider
(
  // Bass kick with sine, noise and filters
  Synth.new(\crdgKick, [
    \n, 110,
    out, Out.ar,
    pan, 0.5,
    sustain, 2,
  ]);
)
```
