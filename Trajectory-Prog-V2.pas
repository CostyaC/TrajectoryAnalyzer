Program P1;

type
  RealArray = Array [0..100] of real;

var
  r: Array [0..100] of real;
  i, n, s: integer;
  a, h, z, Vinit, Angle, dx, x, y1, y2: real;
  g: text;

Begin
  assign(g, 'OUT.txt');
  write('Vinit=');
  readln(Vinit);
  write('Angle=');
  readln(Angle);
  write('dx=');
  readln(dx);

  h := 0;
  x := 0; // Start x from 0
  i := 0;
  writeln('Num...!...x...!...h...');

  repeat
    begin
      i := i + 1;
      y1 := x * (sin(Angle * pi / 180) / (cos(Angle * pi / 180)));
      z := x / (Vinit * cos(Angle * pi / 180));
      y2 := 9.8 * z * z / 2;
      h := y1 - y2;
      x := x + dx;
      writeln(i, '...!...', x:0:2, '...!...', h:0:2);
    end;
  until (h <= 0); // Loop until the projectile hits the ground

  s := i; // Total number of iterations

  rewrite(g);
  write(g, s); // Write total number of iterations to OUT.txt
  close(g);
End.
