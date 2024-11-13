/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.inventory.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Entity data class represents a single row in the database.
 */
/**
 * Data class ini merepresentasikan sebuah entitas atau tabel dalam database Room.
 *
 * 1. **@Entity**: Annotation ini menunjukkan bahwa kelas `Item` adalah sebuah entitas dalam Room.
 *    - `tableName`: Nama tabel dalam database yang akan merepresentasikan entitas ini. Di sini, tabel diberi nama "items".
 *
 * 2. **@PrimaryKey**: Annotation ini digunakan untuk menentukan kolom mana yang menjadi primary key (kunci utama).
 *    - `autoGenerate = true`: Menyatakan bahwa nilai primary key (id) akan di-generate secara otomatis oleh Room ketika entitas baru ditambahkan ke database.
 *
 * 3. **Data Class**: Kelas ini digunakan untuk merepresentasikan baris data dalam tabel database.
 *    - `val id: Int = 0`: Primary key, yang secara default bernilai 0. Ketika entitas baru dimasukkan, nilai ini akan diganti dengan nilai yang di-generate secara otomatis.
 *    - `val name: String`: Nama item. Ini adalah kolom wajib yang menyimpan nama dari suatu item.
 *    - `val price: Double`: Harga item. Kolom ini menyimpan harga dari item, dengan tipe data `Double` untuk mendukung nilai desimal.
 *    - `val quantity: Int`: Kuantitas item yang tersedia dalam inventaris.
 *
 * Secara keseluruhan, kelas ini mendefinisikan struktur tabel dan tipe data yang akan digunakan dalam database Room.
 */
@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
