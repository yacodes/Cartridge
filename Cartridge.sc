Cartridge {
  *new {|server|
    var s = server ? Server.default;

    SynthDef.new(\crdgKick, {|out, pan, sustain = 2, n = 110|
      var env = EnvGen.kr(Env.perc(0.02, sustain, 1, -8), doneAction: Done.freeSelf);
      var noise = LPF.ar(WhiteNoise.ar(), Env.new([n * 10, n, 20], [0, sustain], -2).kr, mul: 5);
      var osc = Resonz.ar(SinOsc.ar(Env.new([n * 10, n, 20], [0, sustain], -1).kr), n, 0.9, mul: 1);
      var sig = Mix.new([noise, osc]);
      OffsetOut.ar(out, DirtPan.ar(sig, ~dirt.numChannels, pan, env));
    }).add(s);
  }
}
