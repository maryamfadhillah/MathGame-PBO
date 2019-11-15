/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameUI;

import Contrller_model.Data;
import Contrller_model.HitungPengurangan;
import Contrller_model.HitungPenjumlahan;
import Contrller_model.Soal;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maryam Fadhillah
 */
public class MathGame {

    Data data = new Data();
    Scanner input = new Scanner(System.in);
    final Soal cetak = new Soal();

    public void Welcome() {
        System.out.println("*****************");
        System.out.println("Game Math");
        System.out.println("*****************");
        System.out.print("Masukkan Nama Anda: ");
        String name = input.nextLine();
        data.setNama(name);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("*****************");
        System.out.println("Game Math");
        System.out.println("*****************");
        System.out.println("Menu");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("----------------");
        System.out.print("Pilih no menu: ");

        int pil = input.nextInt();
        switch (pil) {
            case 1:
                menuPenjumlahan();
                break;
            case 2:
                menuPengurangan();
                break;
            case 3:
                System.exit(0);
            default:
                Welcome();
        }
    }

    public int generateRandomIntIntRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public void menuPenjumlahan() {
        HitungPenjumlahan hitungPenjumlahan = new HitungPenjumlahan();
        System.out.println("***********************");
        System.out.println("Game Math - Penjumlahan");
        System.out.println("***********************");

        while (data.getNyawa()> 0) {
            switch (data.getLevel()) {
                case 1: {
                    int a = generateRandomIntIntRange(0, 10);
                    int b = generateRandomIntIntRange(0, 10);
                    System.out.print(cetak.formatPrint(a, b));
                    int jawaban = hitungPenjumlahan.hitung(a, b);
                    int jawabanInput = 0;
                    if (input.hasNextInt()) {
                        jawabanInput += input.nextInt();
                    } else {
                        jawabanInput += 0;
                    }

                    if (jawaban == jawabanInput) {
                        data.setSkor(data.getSkor() + 4);
                        System.out.println(data.getNama() + "! Kamu benar, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    } else {
                        if (data.getSkor() < 1) {
                            data.setSkor(0);
                        } else {
                            data.setSkor(data.getSkor() - 1);
                        }
                        data.setNyawa(data.getNyawa() - 1);
                        System.out.println(data.getNama() + "! Kamu salah, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    }

                    if (data.getSkor() > 100) {
                        data.setLevel(data.getLevel() + 1);
                    }
                    break; 
                }

                case 2: {
                    int a = generateRandomIntIntRange(-10, -1);
                    int b = generateRandomIntIntRange(-10, -1);
                    System.out.print(cetak.formatPrint(a, b));
                    int jawaban = hitungPenjumlahan.hitung(a, b);
                    int jawabanInput = 0;
                    if (input.hasNextInt()) {
                        jawabanInput += input.nextInt();
                    } else {
                        jawabanInput += 0;
                    }
                    if (jawaban == jawabanInput) {
                        data.setSkor(data.getSkor() + 4);
                        System.out.println(data.getNama() + "! Kamu benar, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    } else {
                        if (data.getSkor() < 1) {
                            data.setSkor(0);
                        } else {
                            data.setSkor(data.getSkor() - 1);
                        }
                        data.setNyawa(data.getNyawa() - 1);
                        System.out.println(data.getNama() + "! Kamu salah, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    }

                    if (data.getSkor() > 200) {
                        data.setLevel(data.getLevel() + 1);
                    }
                    break;
                }

                case 3: {
                    int a = generateRandomIntIntRange(-10, 10);
                    int b = generateRandomIntIntRange(-10, 10);
                    System.out.print(cetak.formatPrint(a, b));
                    int jawaban = hitungPenjumlahan.hitung(a, b);
                    int jawabanInput = 0;
                    if (input.hasNextInt()) {
                        jawabanInput += input.nextInt();
                    } else {
                        jawabanInput += 0;
                    }
                    if (jawaban == jawabanInput) {
                        data.setSkor(data.getSkor() + 4);
                        System.out.println(data.getNama() + "! Kamu benar, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    } else {
                        if (data.getSkor() < 1) {
                            data.setSkor(0);
                        } else {
                            data.setSkor(data.getSkor() - 1);
                        }
                        data.setNyawa(data.getNyawa() - 1);
                        System.out.println(data.getNama() + "! Kamu salah, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    }

                    if (data.getSkor() >= 300) {
                        data.setLevel(data.getLevel() + 1);
                        System.out.println(data.getNama() + "! Anda telah menyelesaikan game pengjumalahan dengan nilai: " + data.getSkor() + ", dan sisa nyawa: " + data.getNyawa()
                                + " Level : " + data.getLevel() + ". Silakan dicoba soal pengurangan ya");
                    }
                    break;
                }
                default:
                    System.exit(0);
                    break;
            }
            if (data.getNyawa() <= 0) {
                System.out.println("Hai " + data.getNama() + ", Jangan menyerah ya untuk mencoba lagi");
                new MathGame().Welcome();
            }
        }
    }

    public void menuPengurangan() {
        HitungPengurangan hitungPengurangan = new HitungPengurangan();
        System.out.println("***********************");
        System.out.println("Game Math - Pengurangan");
        System.out.println("***********************");

        while (data.getNyawa() > 0) {
            switch (data.getLevel()) {
                case 1: {
                    int a = generateRandomIntIntRange(0, 10);
                    int b = generateRandomIntIntRange(0, 10);
                    System.out.print(cetak.formatPrint(a, b, true));
                    int jawaban = hitungPengurangan.hitung(a, b);
                    int jawabanInput = 0;
                    if (input.hasNextInt()) {
                        jawabanInput += input.nextInt();
                    } else {
                        jawabanInput += 0;
                    }
                    if (jawaban == jawabanInput) {
                        data.setSkor(data.getSkor() + 4);
                        System.out.println(data.getNama() + "! Kamu benar, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    } else {
                        if (data.getSkor() < 1) {
                            data.setSkor(0);
                        } else {
                            data.setSkor(data.getSkor() - 1);
                        }
                        data.setNyawa(data.getNyawa() - 1);
                        System.out.println(data.getNama() + "! Kamu salah, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    }

                    if (data.getSkor() > 100) {
                        data.setLevel(data.getLevel() + 1);
                    }
                    break;
                }

                case 2: {
                    int a = generateRandomIntIntRange(-10, -1);
                    int b = generateRandomIntIntRange(-10, -1);
                    System.out.print(cetak.formatPrint(a, b, true));
                    int jawaban = hitungPengurangan.hitung(a, b);
                    int jawabanInput = input.nextInt();
                    if (jawaban == jawabanInput) {
                        data.setSkor(data.getSkor() + 4);
                        System.out.println(data.getNama() + "! Kamu benar, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    } else {
                        if (data.getSkor() < 1) {
                            data.setSkor(0);
                        } else {
                            data.setSkor(data.getSkor() - 1);
                        }
                        data.setNyawa(data.getNyawa() - 1);
                        System.out.println(data.getNama() + "! Kamu salah, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    }

                    if (data.getSkor() > 200) {
                        data.setLevel(data.getLevel() + 1);
                    }
                    break;
                }

                case 3: {
                    int a = generateRandomIntIntRange(-10, 10);
                    int b = generateRandomIntIntRange(-10, 10);
                    System.out.print(cetak.formatPrint(a, b, true));
                    int jawaban = hitungPengurangan.hitung(a, b);
                    int jawabanInput = input.nextInt();
                    if (jawaban == jawabanInput) {
                        data.setSkor(data.getSkor() + 4);
                        System.out.println(data.getNama() + "! Kamu benar, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    } else {
                        if (data.getSkor() < 1) {
                            data.setSkor(0);
                        } else {
                            data.setSkor(data.getSkor() - 1);
                        }
                        data.setNyawa(data.getNyawa() - 1);
                        System.out.println(data.getNama() + "! Kamu salah, nilai: " + data.getSkor() + ", nyawa tersisa: " + data.getNyawa()+ " Level : " + data.getLevel());
                    }

                    if (data.getSkor() >= 300) {
                        data.setLevel(data.getLevel() + 1);
                        System.out.println(data.getNama() + "! Anda telah menyelesaikan game pengjumalahan dengan nilai: " + data.getSkor() + ", dan sisa nyawa: " + data.getNyawa()
                               + " Level : " + data.getLevel() + ". Silakan dicoba soal penjumlahan ya");
                    }
                    break;
                }
                default:
                    System.exit(0);
                    break;
            }
            if (data.getNyawa() <= 0) {
                System.out.println("Hai " + data.getNama() + ", Jangan menyerah ya untuk mencoba lagi");
                new MathGame().Welcome();
            }
        }
    }
}
